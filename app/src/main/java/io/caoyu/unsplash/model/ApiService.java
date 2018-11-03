package io.caoyu.unsplash.model;


import io.caoyu.unsplash.model.entity.PhotosEntity;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Mr.Yangxiufeng
 * DATE 2016/7/21
 * Owspace
 */
public interface ApiService {
    /**
     * 获取图片列表
     * @param page     Page number to retrieve. (Optional; default: 1)
     * @param per_page Number of items per page. (Optional; default: 10)
     * @param order_by How to sort the photos. Optional. (Valid values: latest, oldest, popular; default: latest)
     * @return
     */
    @GET("photos")
    Observable<PhotosEntity> getPhotos(@Query("page") String page, @Query("per_page") String per_page, @Query("order_by") String order_by);
}
