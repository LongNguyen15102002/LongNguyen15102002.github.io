package CTDLGTBUOI14;

import java.util.HashSet;
import java.util.Set;

public class Q929 {
    public int numUniqueEmails(String[] emails){
        Set<String> uniqueEmails = new HashSet<>();
        for (String mail: emails){
            int splitPosition = mail.indexOf("@");
            String localName = mail.substring(0, splitPosition);
            String domainName = mail.substring(splitPosition);

            if(localName.contains("+")){
                int plusPostion = localName.indexOf("+");
                localName = localName.substring(0, plusPostion);
            }

            localName = localName.replaceAll("\\.", "");
            String newEmailName = localName + domainName;
            uniqueEmails.add(newEmailName);
        }
        return uniqueEmails.size();
    }
}
