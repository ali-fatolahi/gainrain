package com.fatolahi.gainrain;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.physics.box2d.CircleShape;
import com.badlogic.gdx.physics.box2d.Shape;

/**
 * Created by Ali_Fatolahi on 1/21/2017.
 */

public class RainDrop {
    private ShapeRenderer shapeRenderer = new ShapeRenderer();

    public Circle getImage() {
        /*shapeRenderer.setColor(Color.CYAN);
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.circle(50, 50, 32);
        shapeRenderer.end();*/

        Circle shape = new Circle(50, 50, 32);
        return shape;
    }
}
