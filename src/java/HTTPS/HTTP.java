/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HTTPS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;
import model.Planets;
import modelDAO.PlanetsDAO;

public class HTTP {

    public static void main(String[] args) {

        try {
            HTTP.Trazer_Planetas_API();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void Trazer_Planetas_API() throws Exception {

        Planets planetas = new Planets();
        PlanetsDAO planetsdao = new PlanetsDAO();

        int x;
        int z = 0;

        for (x = 1; x <= 61; x++) {
            String url = "https://swapi.co/api/planets/" + x + "/?format=json";
            URL objeto = new URL(url);
            HttpURLConnection conect = (HttpURLConnection) objeto.openConnection();

            conect.setRequestMethod("GET");

            conect.setRequestProperty("User-Agent", "Mozilla/5.0");
            int responseCode = conect.getResponseCode();

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(conect.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            JSONObject jsonresp = new JSONObject(response.toString());
            String[] valor = jsonresp.getString("films").split(",");

            planetas.setName(jsonresp.getString("name"));
            planetas.setClimate(jsonresp.getString("climate"));
            planetas.setTerrain(jsonresp.getString("terrain"));
            planetas.setQtdFilmes(valor.length);
            planetas.setStatus(0);

            planetsdao.population(planetas);

        }
    }
}
