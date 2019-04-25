/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Planets;
import modelDAO.PlanetsDAO;

/**
 *
 * @author leonardo
 */
public class Control extends HttpServlet {

    String listarAPI = "pages/ListAPI.jsp";
    String listar = "pages/List.jsp";
    String add = "pages/Create.jsp";
    String edit = "pages/Edit.jsp";
    int id;
    Planets p = new Planets();
    PlanetsDAO dao = new PlanetsDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Control</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Control at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acesso = "";
        String action = request.getParameter("accion");

        if (action.equalsIgnoreCase("List")) {
            acesso = listar;
        } else if (action.equalsIgnoreCase("ListAPI")) {
            acesso = listarAPI;
        } else if (action.equalsIgnoreCase("Crea")) {
            acesso = add;
        } else if (action.equalsIgnoreCase("cadastrar")) {
            String nome = request.getParameter("txtNome");
            String clima = request.getParameter("txtClima");
            String terreno = request.getParameter("txtTerreno");

            p.setId(3);
            p.setName(nome);
            p.setClimate(nome);
            p.setTerrain(terreno);
            p.setQtdFilmes(0);
            p.setStatus(0);

            dao.add(p);
            acesso = listar;
        } else if (action.equalsIgnoreCase("deletar")) {
            id = Integer.parseInt(request.getParameter("id"));
            p.setId(id);
            dao.delete(id);
            acesso = listar;
        }

        RequestDispatcher vista = request.getRequestDispatcher(acesso);
        vista.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
