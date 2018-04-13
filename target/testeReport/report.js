$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CadastroCartao.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: gloureirog@indracompany.com"
    },
    {
      "line": 2,
      "value": "# encoding: iso-8859-1"
    }
  ],
  "line": 4,
  "name": "Registro de Tarjeta - Website Banco Ripley",
  "description": "\nYo como Analista de pruebas\nQuiero registrar una tarjeta",
  "id": "registro-de-tarjeta---website-banco-ripley",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@ProjetoBancoRipley"
    }
  ]
});
formatter.scenario({
  "line": 11,
  "name": "Registro de tarjeta",
  "description": "",
  "id": "registro-de-tarjeta---website-banco-ripley;registro-de-tarjeta",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@CT01"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "CT01 - Pagina principal",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "CT01 - Prints tela de tarjetas",
  "keyword": "When "
});
formatter.match({
  "location": "CadastroCartaoTest.acessarPaginaCadastro()"
});
formatter.result({
  "duration": 8537653864,
  "status": "passed"
});
formatter.match({
  "location": "CadastroCartaoTest.clicarTarjeta()"
});
formatter.result({
  "duration": 53033022459,
  "status": "passed"
});
});