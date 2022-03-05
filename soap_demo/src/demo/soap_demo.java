package demo;
import  com.lavasoft.*;


public class soap_demo {

    public static void main(String[] args) {
        if (args.length != 1){
            System.out.println("please enter the ip address");
        }else{
            String ipaddress = args[0];
            GeoIPService g = new GeoIPService();
            GeoIPServiceSoap gs = g.getGeoIPServiceSoap();
           String location =  gs.getIpLocation(ipaddress);
            System.out.println(location);


        }
    }

}
