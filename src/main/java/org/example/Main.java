package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Bedroom bedroom = new Bedroom("bedroom", new Wall("kuzey"),new Wall("güney"), new Wall("doğu"), new Wall("batı"), new Ceiling(3, PaintColor.WHITE), new Bed("yumuşak", 1,1,1,1), new Lamp(LampType.LAVA,true,100), new Wardrobe(2,3,35.00), new Carpet(2,3,PaintColor.RED) );
        System.out.println(bedroom.getCeiling().getHeight());
    }
}