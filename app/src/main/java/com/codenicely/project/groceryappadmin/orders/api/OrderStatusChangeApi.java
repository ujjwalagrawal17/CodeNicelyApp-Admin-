package com.codenicely.project.groceryappadmin.orders.api;

import com.codenicely.project.groceryappadmin.helper.Urls;
import com.codenicely.project.groceryappadmin.orders.model.data.ChangeStatusData;
import com.codenicely.project.groceryappadmin.orders.model.data.ChangeTotalData;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by meghal on 9/11/16.
 */

public interface OrderStatusChangeApi {

    @FormUrlEncoded
    @POST(Urls.SUB_URL_ADMIN_CHANGE_STATUS)
    Call<ChangeStatusData> requestOrderStatusChange(@Field("access_token") String access_token, @Field("order_id") String order_id
            , @Field("cancel") boolean type);

    @GET(Urls.SUB_URL_ADMIN_CHANGE_TOTAL)
    Call<ChangeTotalData> requestOrderChangeTotal(@Query("access_token") String access_token, @Query("order_id") String order_id
            , @Query("total_new") String new_total);

}
