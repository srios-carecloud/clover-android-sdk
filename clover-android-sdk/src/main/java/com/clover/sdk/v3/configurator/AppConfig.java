/**
 * Copyright (C) 2015 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */

package com.clover.sdk.v3.configurator;

import com.clover.sdk.GenericClient;

@SuppressWarnings("all")
public final class AppConfig implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

 /**
  * Unique identifier
  */
  public java.lang.String getId() {
    return genClient.cacheGet(CacheKey.id);
  }
  public java.lang.String getOpportunityId() {
    return genClient.cacheGet(CacheKey.opportunityId);
  }
  public java.lang.String getMid() {
    return genClient.cacheGet(CacheKey.mid);
  }
  public com.clover.sdk.v3.merchant.MerchantPlan getMerchantPlan() {
    return genClient.cacheGet(CacheKey.merchantPlan);
  }
  public java.util.List<com.clover.sdk.v3.configurator.AppAndSubscription> getAppAndSubscriptions() {
    return genClient.cacheGet(CacheKey.appAndSubscriptions);
  }


  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<AppConfig> {
    id {
      @Override
      public Object extractValue(AppConfig instance) {
        return instance.genClient.extractOther("id", java.lang.String.class);
      }
    },
    opportunityId {
      @Override
      public Object extractValue(AppConfig instance) {
        return instance.genClient.extractOther("opportunityId", java.lang.String.class);
      }
    },
    mid {
      @Override
      public Object extractValue(AppConfig instance) {
        return instance.genClient.extractOther("mid", java.lang.String.class);
      }
    },
    merchantPlan {
      @Override
      public Object extractValue(AppConfig instance) {
        return instance.genClient.extractRecord("merchantPlan", com.clover.sdk.v3.merchant.MerchantPlan.JSON_CREATOR);
      }
    },
    appAndSubscriptions {
      @Override
      public Object extractValue(AppConfig instance) {
        return instance.genClient.extractListRecord("appAndSubscriptions", com.clover.sdk.v3.configurator.AppAndSubscription.JSON_CREATOR);
      }
    },
    ;
  }

  private GenericClient<AppConfig> genClient = new GenericClient<AppConfig>(this);

  /**
   * Constructs a new empty instance.
   */
  public AppConfig() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public AppConfig(String json) throws IllegalArgumentException {
    try {
      genClient.setJsonObject(new org.json.JSONObject(json));
    } catch (org.json.JSONException e) {
      throw new IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public AppConfig(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public AppConfig(AppConfig src) {
    if (src.genClient.getJsonObject() != null) {
      genClient.setJsonObject(com.clover.sdk.v3.JsonHelper.deepCopy(src.genClient.getJSONObject()));
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    return genClient.getJSONObject();
  }


  @Override
  public void validate() {
    genClient.validateLength(getId(), 13);
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'opportunityId' field is set and is not null */
  public boolean isNotNullOpportunityId() {
    return genClient.cacheValueIsNotNull(CacheKey.opportunityId);
  }

  /** Checks whether the 'mid' field is set and is not null */
  public boolean isNotNullMid() {
    return genClient.cacheValueIsNotNull(CacheKey.mid);
  }

  /** Checks whether the 'merchantPlan' field is set and is not null */
  public boolean isNotNullMerchantPlan() {
    return genClient.cacheValueIsNotNull(CacheKey.merchantPlan);
  }

  /** Checks whether the 'appAndSubscriptions' field is set and is not null */
  public boolean isNotNullAppAndSubscriptions() {
    return genClient.cacheValueIsNotNull(CacheKey.appAndSubscriptions);
  }

  /** Checks whether the 'appAndSubscriptions' field is set and is not null and is not empty */
  public boolean isNotEmptyAppAndSubscriptions() { return isNotNullAppAndSubscriptions() && !getAppAndSubscriptions().isEmpty(); }


  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'opportunityId' field has been set, however the value could be null */
  public boolean hasOpportunityId() {
    return genClient.cacheHasKey(CacheKey.opportunityId);
  }

  /** Checks whether the 'mid' field has been set, however the value could be null */
  public boolean hasMid() {
    return genClient.cacheHasKey(CacheKey.mid);
  }

  /** Checks whether the 'merchantPlan' field has been set, however the value could be null */
  public boolean hasMerchantPlan() {
    return genClient.cacheHasKey(CacheKey.merchantPlan);
  }

  /** Checks whether the 'appAndSubscriptions' field has been set, however the value could be null */
  public boolean hasAppAndSubscriptions() {
    return genClient.cacheHasKey(CacheKey.appAndSubscriptions);
  }


  /**
   * Sets the field 'id'.
   */
  public AppConfig setId(java.lang.String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'opportunityId'.
   */
  public AppConfig setOpportunityId(java.lang.String opportunityId) {
    return genClient.setOther(opportunityId, CacheKey.opportunityId);
  }

  /**
   * Sets the field 'mid'.
   */
  public AppConfig setMid(java.lang.String mid) {
    return genClient.setOther(mid, CacheKey.mid);
  }

  /**
   * Sets the field 'merchantPlan'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public AppConfig setMerchantPlan(com.clover.sdk.v3.merchant.MerchantPlan merchantPlan) {
    return genClient.setRecord(merchantPlan, CacheKey.merchantPlan);
  }

  /**
   * Sets the field 'appAndSubscriptions'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public AppConfig setAppAndSubscriptions(java.util.List<com.clover.sdk.v3.configurator.AppAndSubscription> appAndSubscriptions) {
    return genClient.setArrayRecord(appAndSubscriptions, CacheKey.appAndSubscriptions);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'opportunityId' field, the 'has' method for this field will now return false */
  public void clearOpportunityId() {
    genClient.clear(CacheKey.opportunityId);
  }
  /** Clears the 'mid' field, the 'has' method for this field will now return false */
  public void clearMid() {
    genClient.clear(CacheKey.mid);
  }
  /** Clears the 'merchantPlan' field, the 'has' method for this field will now return false */
  public void clearMerchantPlan() {
    genClient.clear(CacheKey.merchantPlan);
  }
  /** Clears the 'appAndSubscriptions' field, the 'has' method for this field will now return false */
  public void clearAppAndSubscriptions() {
    genClient.clear(CacheKey.appAndSubscriptions);
  }


  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return genClient.containsChanges();
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    genClient.resetChangeLog();
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public AppConfig copyChanges() {
    AppConfig copy = new AppConfig();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(AppConfig src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new AppConfig(src).getJSONObject(), src.genClient);
    }
  }

  /**
   * Gets a Bundle which can be used to get and set data attached to this instance. The attached Bundle will be
   * parcelled but not jsonified.
   */
  public android.os.Bundle getBundle() {
    return genClient.getBundle();
  }

  @Override
  public String toString() {
    return genClient.toString();
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(android.os.Parcel dest, int flags) {
    genClient.writeToParcel(dest, flags);
  }

  public static final android.os.Parcelable.Creator<AppConfig> CREATOR = new android.os.Parcelable.Creator<AppConfig>() {
    @Override
    public AppConfig createFromParcel(android.os.Parcel in) {
      AppConfig instance = new AppConfig(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public AppConfig[] newArray(int size) {
      return new AppConfig[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<AppConfig> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<AppConfig>() {
    @Override
    public AppConfig create(org.json.JSONObject jsonObject) {
      return new AppConfig(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;

    public static final boolean OPPORTUNITYID_IS_REQUIRED = false;

    public static final boolean MID_IS_REQUIRED = false;

    public static final boolean MERCHANTPLAN_IS_REQUIRED = false;

    public static final boolean APPANDSUBSCRIPTIONS_IS_REQUIRED = false;

  }

}
