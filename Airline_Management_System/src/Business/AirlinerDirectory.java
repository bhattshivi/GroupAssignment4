/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Mayank
 */
public class AirlinerDirectory {
    private ArrayList<Airliner> airlinerList;
    
    public AirlinerDirectory() {
        this.airlinerList = new ArrayList<Airliner>();
    }
    
    public ArrayList<Airliner> getAirlinerList() {
        return airlinerList;
    }

    public void setAirlinerList(ArrayList<Airliner> airlinerList) {
        this.airlinerList = airlinerList;
    }
    
    public void addAirliner(Airliner airliner) {
        airlinerList.add(airliner);        
    }
}
