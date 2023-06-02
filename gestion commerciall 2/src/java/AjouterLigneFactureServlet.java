import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AjouterLigneFactureServlet")
public class AjouterLigneFactureServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Établir la connexion à la base de données
        JavaDBConnect dbConnect = new JavaDBConnect();
        Connection conn = null;
        try {
            conn = dbConnect.getConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AjouterLigneFactureServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            // Récupérer les références d'articles depuis la base de données
            List<String> references = getReferencesArticles(conn);

            // Générer le formulaire HTML avec les options du champ "Réf. article"
            String formulaire = generateFormulaire(references);

            // Envoyer la réponse au client
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println(formulaire);
        } catch (SQLException e) {
            // Gérer les erreurs de connexion à la base de données
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Erreur lors de la connexion à la base de données.");
        } finally {
            // Fermer la connexion à la base de données
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String refArticle = request.getParameter("ref_article");
        String numeroFactureLigne = request.getParameter("numero_facture_ligne");
        String quantiteVendue = request.getParameter("quantite_vendue");
        
        // Effectuer les opérations nécessaires pour ajouter la ligne de facture à la base de données
        
        // Envoyer la réponse au client
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Ligne de facture ajoutée avec succès !");
    }

    private List<String> getReferencesArticles(Connection conn) throws SQLException {
        List<String> references = new ArrayList<>();
        String query = "SELECT ref_article FROM article";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                String reference = rs.getString("ref_article");
                references.add(reference);
            }
        }
        return references;
    }

    private String generateFormulaire(List<String> references) {
        StringBuilder options = new StringBuilder();
        for (String reference : references) {
            options.append("<option value=\"").append(reference).append("\">").append(reference).append("</option>");
        }

        return "<form action=\"ajouterFactureServlet\" method=\"post\">" +
                "<label for=\"ref_article\">Réf. article:</label>" +
                "<select id=\"ref_article\" name=\"ref_article\">" +
                options.toString() +
                "</select>" +
                "<label for=\"numero_facture_ligne\">N° de facture:</label>" +
                "<input type=\"text\" id=\"numero_facture_ligne\" name=\"numero_facture_ligne\"><br>" +
                "<label for=\"quantite_vendue\">Quantité vendue:</label>" +
                "<input type=\"number\" id=\"quantite_vendue\" name=\"quantite_vendue\" required><br>" +
                "<input type=\"submit\" value=\"Ajouter\">" +
                "</form>";
    }
}
