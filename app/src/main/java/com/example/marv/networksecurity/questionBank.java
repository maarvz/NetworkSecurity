package com.example.marv.networksecurity;

public class questionBank {

    //code learnt from https://www.youtube.com/watch?v=4g1_UH_6VQc

    private String tQuestions [] = {
            "How is integrity of information protected?",
            "Which of the following is an example of a passive attack?",
            "Active attacks are:____",
            "What does the security of symmetric encryption mostly rely on?",
            "Are you able to access intranet files if you are remotely connected to a network using a VPN?",
            "Which of the following is true about public blockchains?",
            "Which of the following is the correct order for WEP authentication and association?",
            "Which of the following uses 64-bit keys?",
            "Which of the following firewall states filter each packet in isolation?",
            "What are the two authentication modes for WPA?",
    };

    private String tOptions [] [] = {
            {"By reserving authorized restriction on information access and disclosure",
                    "By using firewalls",
                    "Implementing fault tolerant networks and services",
                    "Implementing network access control"},
            {"Traffic Analysis","Spoofing","Denial of Services","Wormhole"},
            {"Non-invasive","Hard to detect","Easy to prevent","Invasive"},
            {"Encryption Algorithm","Secrecy of key","Shape of key","None of the above"},
            {"Yes","No","Not sure","Neither"},
            {"Popular in financial contexts, such as banks",
                    "Has operators who have control over the blockchain",
                    "Is centralized","Uses a consensus protocol to verify data"},
            {"Authentication Request, Association Request, Authentication Confirmation, Association Confirmation",
                    "Association Request, Association Confirmation, Authentication Request, Authentication Confirmation",
                    "Authentication Request, Authentication Confirmation, Associated Request, Association Confirmation",
                    "Authentication Confirmation, Association Confrimation"},
            {"WPA","WPA2","WEP","None of the above"},
            {"Stateless","Stateful","All of the above","None of the above"},
            {"Enterprise and Personal",
                    "Personal and Worldwide",
                    "Business and Personal",
                    "Business and Enterprise"}
    };

    private String tRightAnswer[] = {
            "By using firewalls",
            "Traffic Analysis",
            "Invasive",
            "Secrecy of key",
            "Yes",
            "Uses a consensus protocol to verify data",
            "Authentication Request, Authentication Confirmation, Associated Request, Association Confirmation",
            "WEP",
            "Stateless",
            "Enterprise and Personal"};

    public String getQuestion(int a) {
        String question = tQuestions[a];
        return question;
    }

    public String getOption1(int a) {
        String option1 = tOptions[a] [0];
        return option1;
    }

    public String getOption2(int a) {
        String option2 = tOptions[a] [1];
        return option2;
    }

    public String getOption3(int a) {
        String option3 = tOptions[a] [2];
        return option3;
    }

    public String getOption4(int a) {
        String option4 = tOptions[a] [3];
        return option4;
    }

    public String getRightAnswer(int a) {
        String answer = tRightAnswer[a];
        return answer;
    }

}
