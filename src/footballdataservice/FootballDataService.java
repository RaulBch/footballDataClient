/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballdataservice;

/**
 *
 * @author entrar
 */
public class FootballDataService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TGameInfo answer = nextGame();
        System.out.println(answer.getTeam1() + " " + answer.getSResult() + "" + answer.getTeam2());
    }

    private static TGameInfo nextGame() {
        footballdataservice.Info service = new footballdataservice.Info();
        footballdataservice.InfoSoapType port = service.getInfoSoap();
        return port.nextGame();
    }

    
}
