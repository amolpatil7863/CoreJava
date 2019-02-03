/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobportal.data;
import java.io.Serializable;
/**
 *
 * @author AMOL
 */
public class Summary implements Serializable
{
   private String profileSummary; 

    public String getProfileSummary() {
        return profileSummary;
    }

    public void setProfileSummary(String profileSummary) {
        this.profileSummary = profileSummary;
    }
}
