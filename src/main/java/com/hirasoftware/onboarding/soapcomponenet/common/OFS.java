package com.hirasoftware.onboarding.soapcomponenet.common;

public class OFS {
    private String messageID;
    public String ComposedOFS;
    public OFS(String messageID) {
        this.messageID = messageID;
    }
    public String getComposedOFS() {
        return ComposedOFS;
    }
    public String getOFSBody() {
    String     ComposedOFS = String.format(
    		"\t<OfsFunction>\n"
    		+ "\t\t<messageId>%s</messageId>\n"
    		+ "\t</OfsFunction>\n",this.messageID);
   return ComposedOFS;
    }
}
