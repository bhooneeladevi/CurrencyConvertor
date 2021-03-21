/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soulfulwanderer.currencyconvertor.resources;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author BHARGAVA
 */
@WebService(serviceName = "CurWS")
public class CurWS {

@WebMethod(operationName = "RupeesToDollar")

public double RupeesToDollar(@WebParam(name = "Rupees") double Rupees)

{

return (Rupees/46.5);

}

@WebMethod(operationName = "RupeesToEuro")

public double RupeesToEuro(@WebParam(name = "Rupees") double Rupees)

{

return (Rupees/68.64);

}

@WebMethod(operationName = "RupeesToPounds")

public double RupeesToPounds(@WebParam(name = "Rupees") double Rupees)

{

return (Rupees/73.55); }

@WebMethod(operationName = "RupeesToReal")

public double RupeesToReal(@WebParam(name = "Rupees") double Rupees)

{

return (Rupees/26.7);

}

@WebMethod(operationName = "RupeesToRiggit")

public double RupeesToRiggit(@WebParam(name = "Rupees") double Rupees)

{

return (Rupees/13.67);

}
}
