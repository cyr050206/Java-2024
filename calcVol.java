import vol.*;
class calcVol {
    public static void main(String[] args){
        int r = Integer.parseInt(args[0]);
        int h = Integer.parseInt(args[1]);
        cylinder calcvol = new cylinder();
        double volume = calcvol.volume(r,h);
        System.out.println("The Volume is "+volume);
    }
}