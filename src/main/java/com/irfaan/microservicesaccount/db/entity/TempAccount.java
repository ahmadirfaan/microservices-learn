package com.irfaan.microservicesaccount.db.entity;

import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;

/**
 * @author Ahmad Irfaan
 * @date 7/19/2021 10:49 AM
 * microservices-account
 */

@Data
@RedisHash(value = "account", timeToLive = 3600)
public class TempAccount {
   @Id
   private String id;

   private String email;
   private boolean valid = false;
}