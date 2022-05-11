package com.company;

import com.company.view.IOView;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        //we are starting our software, we are booting it
        System.out.println("\nStarting myWorld, hello!\n");

        //we are starting the main loop
        IOView.mainLoopView();

        //Exit program
        System.out.println("\nFinishing myWorld, bye, bye!");
    }
}