/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hockey.hockey;

/**
 *
 * @author James
 */
public class Player {
    private String name;
    private int salary;
    private double fantasyPointsPerGame;
    private double adjustedFantasyPointsPerGame;
    private String position;
    private String opponent;
    private String team;
    
    public Player(String name, int salary, double fantasyPointsPerGame, double adjustedFantasyPointsPerGame, String position, String opponent, String team) {
        this.name = name;
        this.salary = salary;
        this.fantasyPointsPerGame = fantasyPointsPerGame;
        this.adjustedFantasyPointsPerGame = adjustedFantasyPointsPerGame;
        this.position = position;
        this.opponent = opponent;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getFantasyPointsPerGame() {
        return fantasyPointsPerGame;
    }

    public void setFantasyPointsPerGame(double fantasyPointsPerGame) {
        this.fantasyPointsPerGame = fantasyPointsPerGame;
    }

    public double getAdjustedFantasyPointsPerGame() {
        return adjustedFantasyPointsPerGame;
    }

    public void setAdjustedFantasyPointsPerGame(double adjustedFantasyPointsPerGame) {
        this.adjustedFantasyPointsPerGame = adjustedFantasyPointsPerGame;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getOpponent() {
        return opponent;
    }

    public void setOpponent(String opponent) {
        this.opponent = opponent;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", salary=" + salary + ", fantasyPointsPerGame=" + fantasyPointsPerGame + ", adjustedFantasyPointsPerGame=" + adjustedFantasyPointsPerGame + ", position=" + position + ", opponent=" + opponent + ", team=" + team + '}';
    }
}
