/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author tien
 */
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShapeFactory factory= ShapeFactory.createInstance();
        
        Shape rectangle= factory.createShape(ShapeType.rectangle);
        rectangle.setBrush("Cửa gỗ");
        rectangle.setFrame("170cm chiều dài");
        rectangle.setPaper("212×109cm cao & rộng");
        
        Shape triangle= factory.createShape(ShapeType.triangle);
        triangle.setBrush("Cửa sắt");
        triangle.setFrame("280cm chiều dài");
        triangle.setPaper("412×129cm cao & rộng");
        
        Shape circle= factory.createShape(ShapeType.circle);
        circle.setBrush("Cửa Nhôm");
        circle.setFrame("240cm chiều dài");
        circle.setPaper("312×129cm cao & rộng");
        
        System.out.println("Loại cửa 1:\n"+rectangle.draw()+"\n");
        System.out.println("Loại cửa 2:\n"+triangle.draw()+"\n");
        System.out.println("Loại cửa 3:\n"+circle.draw()+"\n");
    }
    
}
