/**
 * Area of Circle = Pi * r * r (3.14 * r * r)
 */
public class Area_of_Circle {

static float findArea(float radius) {

float result = (3.14f * radius * radius);

return result;
}

public static void main(String[] args) {

float r = 2;

System.out.println(findArea(r));
}
}