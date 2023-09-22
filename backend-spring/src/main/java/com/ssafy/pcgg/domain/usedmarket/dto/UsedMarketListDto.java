package com.ssafy.pcgg.domain.usedmarket.dto;

import com.ssafy.pcgg.domain.usedmarket.entity.UsedMarket;
import lombok.Builder;

public class UsedMarketListDto {

  private Long id;
  private String title;
  private String content;
  private Integer price;
  private String summary;

  public UsedMarketListDto(UsedMarket usedMarket) {
    this.id = usedMarket.getId();
    this.title = usedMarket.getTitle();
    this.content = usedMarket.getContent();
    this.price = usedMarket.getPrice();
    this.summary = usedMarket.getSummary();

  }



}
