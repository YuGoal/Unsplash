package io.caoyu.unsplash.model.entity;

import java.util.List;

public class PhotosEntity {


    /**
     * id : LBI7cgq3pbM
     * created_at : 2016-05-03T11:00:28-04:00
     * updated_at : 2016-07-10T11:00:01-05:00
     * width : 5245
     * height : 3497
     * color : #60544D
     * likes : 12
     * liked_by_user : false
     * description : A man drinking a coffee.
     * user : {"id":"pXhwzz1JtQU","username":"poorkane","name":"Gilbert Kane","portfolio_url":"https://theylooklikeeggsorsomething.com/","bio":"XO","location":"Way out there","total_likes":5,"total_photos":74,"total_collections":52,"instagram_username":"instantgrammer","twitter_username":"crew","profile_image":{"small":"https://images.unsplash.com/face-springmorning.jpg?q=80&fm=jpg&crop=faces&fit=crop&h=32&w=32","medium":"https://images.unsplash.com/face-springmorning.jpg?q=80&fm=jpg&crop=faces&fit=crop&h=64&w=64","large":"https://images.unsplash.com/face-springmorning.jpg?q=80&fm=jpg&crop=faces&fit=crop&h=128&w=128"},"links":{"self":"https://api.unsplash.com/users/poorkane","html":"https://unsplash.com/poorkane","photos":"https://api.unsplash.com/users/poorkane/photos","likes":"https://api.unsplash.com/users/poorkane/likes","portfolio":"https://api.unsplash.com/users/poorkane/portfolio"}}
     * current_user_collections : [{"id":206,"title":"Makers: Cat and Ben","published_at":"2016-01-12T18:16:09-05:00","updated_at":"2016-07-10T11:00:01-05:00","curated":false,"cover_photo":null,"user":null}]
     * urls : {"raw":"https://images.unsplash.com/face-springmorning.jpg","full":"https://images.unsplash.com/face-springmorning.jpg?q=75&fm=jpg","regular":"https://images.unsplash.com/face-springmorning.jpg?q=75&fm=jpg&w=1080&fit=max","small":"https://images.unsplash.com/face-springmorning.jpg?q=75&fm=jpg&w=400&fit=max","thumb":"https://images.unsplash.com/face-springmorning.jpg?q=75&fm=jpg&w=200&fit=max"}
     * links : {"self":"https://api.unsplash.com/photos/LBI7cgq3pbM","html":"https://unsplash.com/photos/LBI7cgq3pbM","download":"https://unsplash.com/photos/LBI7cgq3pbM/download","download_location":"https://api.unsplash.com/photos/LBI7cgq3pbM/download"}
     */

    private String id;
    private String created_at;
    private String updated_at;
    private int width;
    private int height;
    private String color;
    private int likes;
    private boolean liked_by_user;
    private String description;
    private UserBean user;
    private UrlsBean urls;
    private LinksBeanX links;
    private List<CurrentUserCollectionsBean> current_user_collections;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public boolean isLiked_by_user() {
        return liked_by_user;
    }

    public void setLiked_by_user(boolean liked_by_user) {
        this.liked_by_user = liked_by_user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public UrlsBean getUrls() {
        return urls;
    }

    public void setUrls(UrlsBean urls) {
        this.urls = urls;
    }

    public LinksBeanX getLinks() {
        return links;
    }

    public void setLinks(LinksBeanX links) {
        this.links = links;
    }

    public List<CurrentUserCollectionsBean> getCurrent_user_collections() {
        return current_user_collections;
    }

    public void setCurrent_user_collections(List<CurrentUserCollectionsBean> current_user_collections) {
        this.current_user_collections = current_user_collections;
    }

    public static class UserBean {
        /**
         * id : pXhwzz1JtQU
         * username : poorkane
         * name : Gilbert Kane
         * portfolio_url : https://theylooklikeeggsorsomething.com/
         * bio : XO
         * location : Way out there
         * total_likes : 5
         * total_photos : 74
         * total_collections : 52
         * instagram_username : instantgrammer
         * twitter_username : crew
         * profile_image : {"small":"https://images.unsplash.com/face-springmorning.jpg?q=80&fm=jpg&crop=faces&fit=crop&h=32&w=32","medium":"https://images.unsplash.com/face-springmorning.jpg?q=80&fm=jpg&crop=faces&fit=crop&h=64&w=64","large":"https://images.unsplash.com/face-springmorning.jpg?q=80&fm=jpg&crop=faces&fit=crop&h=128&w=128"}
         * links : {"self":"https://api.unsplash.com/users/poorkane","html":"https://unsplash.com/poorkane","photos":"https://api.unsplash.com/users/poorkane/photos","likes":"https://api.unsplash.com/users/poorkane/likes","portfolio":"https://api.unsplash.com/users/poorkane/portfolio"}
         */

        private String id;
        private String username;
        private String name;
        private String portfolio_url;
        private String bio;
        private String location;
        private int total_likes;
        private int total_photos;
        private int total_collections;
        private String instagram_username;
        private String twitter_username;
        private ProfileImageBean profile_image;
        private LinksBean links;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPortfolio_url() {
            return portfolio_url;
        }

        public void setPortfolio_url(String portfolio_url) {
            this.portfolio_url = portfolio_url;
        }

        public String getBio() {
            return bio;
        }

        public void setBio(String bio) {
            this.bio = bio;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public int getTotal_likes() {
            return total_likes;
        }

        public void setTotal_likes(int total_likes) {
            this.total_likes = total_likes;
        }

        public int getTotal_photos() {
            return total_photos;
        }

        public void setTotal_photos(int total_photos) {
            this.total_photos = total_photos;
        }

        public int getTotal_collections() {
            return total_collections;
        }

        public void setTotal_collections(int total_collections) {
            this.total_collections = total_collections;
        }

        public String getInstagram_username() {
            return instagram_username;
        }

        public void setInstagram_username(String instagram_username) {
            this.instagram_username = instagram_username;
        }

        public String getTwitter_username() {
            return twitter_username;
        }

        public void setTwitter_username(String twitter_username) {
            this.twitter_username = twitter_username;
        }

        public ProfileImageBean getProfile_image() {
            return profile_image;
        }

        public void setProfile_image(ProfileImageBean profile_image) {
            this.profile_image = profile_image;
        }

        public LinksBean getLinks() {
            return links;
        }

        public void setLinks(LinksBean links) {
            this.links = links;
        }

        public static class ProfileImageBean {
            /**
             * small : https://images.unsplash.com/face-springmorning.jpg?q=80&fm=jpg&crop=faces&fit=crop&h=32&w=32
             * medium : https://images.unsplash.com/face-springmorning.jpg?q=80&fm=jpg&crop=faces&fit=crop&h=64&w=64
             * large : https://images.unsplash.com/face-springmorning.jpg?q=80&fm=jpg&crop=faces&fit=crop&h=128&w=128
             */

            private String small;
            private String medium;
            private String large;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }
        }

        public static class LinksBean {
            /**
             * self : https://api.unsplash.com/users/poorkane
             * html : https://unsplash.com/poorkane
             * photos : https://api.unsplash.com/users/poorkane/photos
             * likes : https://api.unsplash.com/users/poorkane/likes
             * portfolio : https://api.unsplash.com/users/poorkane/portfolio
             */

            private String self;
            private String html;
            private String photos;
            private String likes;
            private String portfolio;

            public String getSelf() {
                return self;
            }

            public void setSelf(String self) {
                this.self = self;
            }

            public String getHtml() {
                return html;
            }

            public void setHtml(String html) {
                this.html = html;
            }

            public String getPhotos() {
                return photos;
            }

            public void setPhotos(String photos) {
                this.photos = photos;
            }

            public String getLikes() {
                return likes;
            }

            public void setLikes(String likes) {
                this.likes = likes;
            }

            public String getPortfolio() {
                return portfolio;
            }

            public void setPortfolio(String portfolio) {
                this.portfolio = portfolio;
            }
        }
    }

    public static class UrlsBean {
        /**
         * raw : https://images.unsplash.com/face-springmorning.jpg
         * full : https://images.unsplash.com/face-springmorning.jpg?q=75&fm=jpg
         * regular : https://images.unsplash.com/face-springmorning.jpg?q=75&fm=jpg&w=1080&fit=max
         * small : https://images.unsplash.com/face-springmorning.jpg?q=75&fm=jpg&w=400&fit=max
         * thumb : https://images.unsplash.com/face-springmorning.jpg?q=75&fm=jpg&w=200&fit=max
         */

        private String raw;
        private String full;
        private String regular;
        private String small;
        private String thumb;

        public String getRaw() {
            return raw;
        }

        public void setRaw(String raw) {
            this.raw = raw;
        }

        public String getFull() {
            return full;
        }

        public void setFull(String full) {
            this.full = full;
        }

        public String getRegular() {
            return regular;
        }

        public void setRegular(String regular) {
            this.regular = regular;
        }

        public String getSmall() {
            return small;
        }

        public void setSmall(String small) {
            this.small = small;
        }

        public String getThumb() {
            return thumb;
        }

        public void setThumb(String thumb) {
            this.thumb = thumb;
        }
    }

    public static class LinksBeanX {
        /**
         * self : https://api.unsplash.com/photos/LBI7cgq3pbM
         * html : https://unsplash.com/photos/LBI7cgq3pbM
         * download : https://unsplash.com/photos/LBI7cgq3pbM/download
         * download_location : https://api.unsplash.com/photos/LBI7cgq3pbM/download
         */

        private String self;
        private String html;
        private String download;
        private String download_location;

        public String getSelf() {
            return self;
        }

        public void setSelf(String self) {
            this.self = self;
        }

        public String getHtml() {
            return html;
        }

        public void setHtml(String html) {
            this.html = html;
        }

        public String getDownload() {
            return download;
        }

        public void setDownload(String download) {
            this.download = download;
        }

        public String getDownload_location() {
            return download_location;
        }

        public void setDownload_location(String download_location) {
            this.download_location = download_location;
        }
    }

    public static class CurrentUserCollectionsBean {
        /**
         * id : 206
         * title : Makers: Cat and Ben
         * published_at : 2016-01-12T18:16:09-05:00
         * updated_at : 2016-07-10T11:00:01-05:00
         * curated : false
         * cover_photo : null
         * user : null
         */

        private int id;
        private String title;
        private String published_at;
        private String updated_at;
        private boolean curated;
        private Object cover_photo;
        private Object user;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getPublished_at() {
            return published_at;
        }

        public void setPublished_at(String published_at) {
            this.published_at = published_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public boolean isCurated() {
            return curated;
        }

        public void setCurated(boolean curated) {
            this.curated = curated;
        }

        public Object getCover_photo() {
            return cover_photo;
        }

        public void setCover_photo(Object cover_photo) {
            this.cover_photo = cover_photo;
        }

        public Object getUser() {
            return user;
        }

        public void setUser(Object user) {
            this.user = user;
        }
    }
}
