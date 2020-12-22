package com.ex.conversionapp;

public class unit_convert {
    private double num,res;
    String main_cat, type;

    unit_convert(double num, String main_cat, String type){
        this.num=num;
        this.main_cat=main_cat;
        this.type=type;
        res=0;
    }
    public double get_res(){
        check_quant();
        return res;
    }

    public void check_quant(){
       System.out.println(main_cat);
       System.out.println(type);


            if(main_cat.equalsIgnoreCase("Currency")) {
                System.out.println(main_cat);
                System.out.println(type);

                if (type.equalsIgnoreCase("$ to PKR") || type.equalsIgnoreCase("PKR to $")) {
                    System.out.println(type);
                    dollar_pkr_conv();
                } else if (type.equalsIgnoreCase("Euro to PKR" )|| type.equalsIgnoreCase( "PKR to Euro")) {
                    euro_pkr_conv();
                }

                System.out.println(res);

            }

            if(main_cat.equalsIgnoreCase("Weight")) {
                if (type.equalsIgnoreCase("Kg to lbs") || type.equalsIgnoreCase("lbs to Kg")) {
                    kg_lbs_conv();
                } else if (type.equalsIgnoreCase("gm to pound") || type.equalsIgnoreCase("pound to gm")) {
                    gm_lbs_conv();
                }
            }

            if(main_cat.equalsIgnoreCase("Length")) {

                if (type.equalsIgnoreCase( "meter to feet") || type.equalsIgnoreCase("feet to meter")) {
                    meter_feet_conv();
                } else if (type.equalsIgnoreCase("meter to inch") || type.equalsIgnoreCase("inch to meter")) {
                    meter_inch_conv();
                }
            }

            if(main_cat.equalsIgnoreCase("Temperature")) {
                if (type.equalsIgnoreCase("Celsius to Fahrenheit") || type.equalsIgnoreCase("Fahrenheit to Celsius")) {
                    cel_fah_conv();
                } else if (type.equalsIgnoreCase("Celsius to Kelvin") || type.equalsIgnoreCase( "Kelvin to Celsius")) {
                    cel_kel_conv();

                }
            }

            if(main_cat.equalsIgnoreCase("Time")) {

                if (type .equalsIgnoreCase( "min to sec" )|| type.equalsIgnoreCase( "sec to min")) {
                    min_sec_conv();
                } else if (type.equalsIgnoreCase( "hr to min") || type.equalsIgnoreCase( "min to hr")) {
                    hr_min_conv();
                }
            }

            if(main_cat.equalsIgnoreCase("Speed")) {

                if(type.equalsIgnoreCase("m/s to km/h") || type.equalsIgnoreCase("km/h to m/s")){
                        ms_kmh_conv();
                    }
                    else if(type.equalsIgnoreCase("mil/h to m/s") || type.equalsIgnoreCase("m/s to mil/h")){
                        mils_ms_conv();

                    }

            }

    }

    public double dollar_pkr_conv(){
        res=0;


        if(type.equalsIgnoreCase("$ to PKR")){
            res=num*160.40;

        }
        else if(type.equalsIgnoreCase("PKR to $")){
            res=num/160.40;
        }

        return res;

    }

    public double euro_pkr_conv(){
        res=0;


        if(type.equalsIgnoreCase("Euro to PKR")){
            res=num*196.20;

        }
        else if(type.equalsIgnoreCase("PKR to Euro")){
            res=num/196.20;
        }

        return res;

    }

    public double kg_lbs_conv(){
        res=0;


        if(type.equalsIgnoreCase("Kg to lbs")){
            res=num*2.204;

        }
        else if(type.equalsIgnoreCase("lbs to Kg")){
            res=num/2.204;
        }

        return res;

    }

    public double gm_lbs_conv(){
        res=0;


        if(type.equalsIgnoreCase("gm to lbs")){
            res=num*0.00220462;

        }
        else if(type.equalsIgnoreCase("lbs to gm")){
            res=num/0.00220462;
        }

        return res;

    }

    public double meter_feet_conv(){
        res=0;


        if(type.equalsIgnoreCase("meter to feet")){
            res=num*3.280;

        }
        else if(type.equalsIgnoreCase("feet to meter")){
            res=num/3.280;
        }

        return res;

    }

    public double meter_inch_conv(){
        res=0;


        if(type.equalsIgnoreCase("meter to inch")){
            res=num*39.3701;

        }
        else if(type.equalsIgnoreCase("inch to meter")){
            res=num/39.3701;
        }

        return res;

    }

    public double cel_fah_conv(){
        res=0;


        if(type.equalsIgnoreCase("Celsius to Fahrenheit")){
            res=(num * (9/5)) + 32;

        }
        else if(type.equalsIgnoreCase("Fahrenheit to Celsius")){
            res=(num-32) * (5/9);
        }

        return res;

    }

    public double cel_kel_conv(){
        res=0;


        if(type.equalsIgnoreCase("Celsius to Kelvin")){
            res=num +273;

        }
        else if(type.equalsIgnoreCase("Kelvin to Celsius")){
            res=num-273;
        }

        return res;

    }

    public double min_sec_conv(){
        res=0;


        if(type.equalsIgnoreCase("min to sec")){
            res=num *60;

        }
        else if(type.equalsIgnoreCase("sec to min")){
            res=num/60;
        }

        return res;

    }
    public double hr_min_conv(){
        res=0;


        if(type.equalsIgnoreCase("hr to min")){
            res=num *60;

        }
        else if(type.equalsIgnoreCase("min to hr")){
            res=num/60;
        }

        return res;

    }

    public double ms_kmh_conv(){
        res=0;


        if(type.equalsIgnoreCase("m/s to km/h")){
            res=num *3.6;

        }
        else if(type.equalsIgnoreCase("km/h to m/s")){
            res=num/3.6;
        }

        return res;

    }

    public double mils_ms_conv(){
        res=0;


        if(type.equalsIgnoreCase("m/s to mil/h")){
            res=num *2.2;

        }
        else if(type.equalsIgnoreCase("mil/h to m/s")){
            res=num/3.6;
        }

        return res;

    }




}
