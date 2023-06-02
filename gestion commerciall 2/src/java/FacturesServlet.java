
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FacturesServlet")
public class FacturesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            JavaDBConnect dbConnect = new JavaDBConnect();
            
            // Obtention d'une connexion depuis la classe JavaDBConnect
            Connection con = dbConnect.getConnection();
            
            // Créer la requête SQL pour récupérer la liste des factures
            String query = "SELECT * FROM facture";
            
            // Créer un objet Statement pour exécuter la requête SQL
            Statement statement = con.createStatement();
            
            // Exécuter la requête SQL et obtenir le résultat
            ResultSet resultSet = statement.executeQuery(query);
            
            // Créer une chaîne HTML pour générer le tableau des factures
            StringBuilder htmlTable = new StringBuilder();
            htmlTable.append("<style>");
            htmlTable.append("table {");
            htmlTable.append("  width: 80%;");
            htmlTable.append("  margin: 0 auto;");
            htmlTable.append("  border-collapse: collapse;");
            htmlTable.append("}");
            htmlTable.append("th, td {");
            htmlTable.append("  padding: 8px;");
            htmlTable.append("  border: 1px solid #ddd;");
            htmlTable.append("}");
            htmlTable.append("th {");
            htmlTable.append("  background-color: #f2f2f2;");
            htmlTable.append("}");
            htmlTable.append("</style>");
            htmlTable.append("<table>");
            htmlTable.append("<tr><th>N°-facture</th><th>Date-facture</th><th>Mode-paiement</th><th>Détails</th><th>Supprimer</th></tr>");
            
            // Parcourir les résultats de la requête et générer les lignes du tableau
            while (resultSet.next()) {
                String numFacture = resultSet.getString("n_facture");
                String dateFacture = resultSet.getString("date_facture");
                String modePaiement = resultSet.getString("mode_paiement");
                
                htmlTable.append("<tr>");
                htmlTable.append("<td>").append(numFacture).append("</td>");
                htmlTable.append("<td>").append(dateFacture).append("</td>");
                htmlTable.append("<td>").append(modePaiement).append("</td>");
                htmlTable.append("<td><a href=\"#\" style=\"color: blue;\">Détails</a></td>");
                htmlTable.append("<td><a href=\"#\" style=\"color: red;\">Supprimer</a></td>");
                htmlTable.append("</tr>");
            }
            
            htmlTable.append("</table>");
            
            // Fermer la connexion, le Statement et le ResultSet
            resultSet.close();
            statement.close();
            con.close();
            
            // Envoyer la réponse HTTP avec le contenu du tableau
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println(htmlTable.toString());
        } catch (SQLException ex) {
            // Gérer les erreurs liées à la base de données
            PrintWriter out = response.getWriter();
            out.println(ex);
            ex.printStackTrace();
        } catch (Exception ex) {
            // Gérer les autres exceptions
            PrintWriter out = response.getWriter();
            out.println(ex);
            ex.printStackTrace();
        }
    }
}
