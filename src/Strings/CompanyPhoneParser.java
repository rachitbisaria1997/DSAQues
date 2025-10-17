package Strings;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CompanyPhoneParser {

    public static void main(String[] args){

        String input = "airtel:12345;jio:901;idea:1991;airtel:9000;jio:902;idea:1992;airtel:8000";
        // output should be airtel 3 12345 9000 8000 jio 2 901 902 idea 2 1991 1992
        String[] entries = input.split(";");

        Map<String, List<String>> companyPhones = new LinkedHashMap<>();

        for(String entry : entries){

            String[] parts = entry.split(":");
            if(parts.length == 2){

                String companyName = parts[0].trim();
                String phoneNumber = parts[1].trim();

                companyPhones.computeIfAbsent(companyName, k -> new ArrayList<>()).add(phoneNumber);
            }
        }

        for(Map.Entry<String, List<String>> map : companyPhones.entrySet()){
            String company = map.getKey();
            List<String> numbers = map.getValue();

            System.out.print(company + " " + numbers.size() + " ");
            for(String num : numbers){
                System.out.print(num + " ");
            }
        }

    }
}
