package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.OfficeTemperature;
import services.OfficeTemperatureService;

public class OfficeTemperatureServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        OfficeTemperatureService otService = new OfficeTemperatureService(getServletContext().getRealPath("/WEB-INF/office_temperature.txt"));
        OfficeTemperature officeTemperature = otService.getCurrentOfficeTemperature();
        
        request.setAttribute("office_temperature", officeTemperature);
        
        boolean inRange = otService.isInRange(officeTemperature);
        request.setAttribute("in_range", inRange);
        
        getServletContext().getRequestDispatcher("/WEB-INF/office_temperature.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO
    }
}