package com.twigsoftwares.alveo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

// How to create pojo class json ? just visit http://www.jsonschema2pojo.org/
// Select source type JSON
// Annotation style: Gson
// also select  certain parameters like
// Use double numbers if necessary
// Include getters and setters
// Include constructors
// Allow additional properties
// and click on preview

/* Expected Success Json
{
  "devices": [
    {
      "name": "Rescue sensor",
      "lastsycned": "2 min ago",
      "pairedwith": "Ventolin 200 | 1 Puff | Twice Daily",
      "type": 0
    },
    {
      "name": "Controller sensor 01",
      "lastsycned": "6 min ago",
      "pairedwith": "Ventolin 200 | 1 Puff | Twice Daily",
      "type": 0
    },
    {
      "name": "Controller sensor 02",
      "lastsycned": "5 dec 2019 03:00 pm",
      "pairedwith": "No Medication",
      "type": 0
    },
    {
      "name": "alveoAir",
      "lastsycned": "5 dec 2019 03:00 pm",
      "pairedwith": "No Medication",
      "type": 1
    }
  ]
}
*/

public class Device {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("lastsycned")
    @Expose
    private String lastsycned;
    @SerializedName("pairedwith")
    @Expose
    private String pairedwith;
    @SerializedName("type")
    @Expose
    private Integer type;

    public Device(String name, String lastsycned, String pairedwith, Integer type) {
        this.name = name;
        this.lastsycned = lastsycned;
        this.pairedwith = pairedwith;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastsycned() {
        return lastsycned;
    }

    public void setLastsycned(String lastsycned) {
        this.lastsycned = lastsycned;
    }

    public String getPairedwith() {
        return pairedwith;
    }

    public void setPairedwith(String pairedwith) {
        this.pairedwith = pairedwith;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

}
