/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lilol
 */
public class Runner {
    private String name;
    private int speed;

    public Runner(String name) {
        this.setName(name);
        this.setSpeed((int) ((Math.random() * 30)));
    }

    public Runner() {
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    private void setSpeed(int speed) {
        this.speed = speed;
    }
    
}
