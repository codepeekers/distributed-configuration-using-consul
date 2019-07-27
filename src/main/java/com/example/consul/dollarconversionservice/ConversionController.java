package com.example.consul.dollarconversionservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/convert")
public class ConversionController {

  @Autowired private AppConfig appConfig;

  @GetMapping("/inr/{value}")
  public String fromInrToUsd(@PathVariable("value") int value) {
    double ret = value / Double.valueOf(appConfig.getInrValue());
    return value + " INR = " + ret + " USD";
  }

  @GetMapping("/aud/{value}")
  public String fromInrToAud(@PathVariable("value") int value) {
    double ret = value / Double.valueOf(appConfig.getAudValue());
    return value + " AUD = " + ret + " USD";
  }

  @GetMapping("/euro/{value}")
  public String fromInrToEuro(@PathVariable("value") int value) {
    double ret = value / Double.valueOf(appConfig.getEurValue());
    return value + " EURO = " + ret + " USD";
  }
}
