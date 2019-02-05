/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab26_guiplasspersistence;

/**
 *
 * @author Edwin Caiza
 */
public class Projectile {
    
    private float velocity;
    private float angle;
    private float distance;
    private final float gravity = (float) 9.8;

    public Projectile() {
    }

    public Projectile(float velocity, float angle, float distance) {
        this.velocity = velocity;
        this.angle = angle;
        this.distance = distance;
    }

    public float getVelocity() {
        return velocity;
    }

    public void setVelocity(float velocity) {
        this.velocity = velocity;
    }

    public float getAngle() {
        return angle;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }

    public float getDistance() {
        float rad=(float) Math.toRadians(getAngle());
        distance = (float) ((getVelocity()*getVelocity())*Math.sin(2*rad))/gravity;
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }
    
    
}
