package org.example;

import org.example.controller.UserController;
import org.example.view.DashboardView;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UserController userController = UserController.getInstance();
        DashboardView dashboardView = new DashboardView(userController);
        dashboardView.viewMenu();
    }
}