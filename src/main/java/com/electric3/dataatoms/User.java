package com.electric3.dataatoms;

public class User extends Gsonable {
    private String user_id = "";
    private UserMetadata user_metadata;
    private String email = "";
    private String password = "";
    private String connection = "";
    private long created_at = 0;
    private long modified_at = 0;

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setUser_metadata(UserMetadata user_metadata) {
        this.user_metadata = user_metadata;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public void setCreated_at(long created_at) {
        this.created_at = created_at;
    }

    public void setModified_at(long modified_at) {
        this.modified_at = modified_at;
    }

    public String getPassword() {
        return password;
    }

    public long getCreated_at() {
        return created_at;
    }

    public String getUser_id() {
        return user_id;
    }

    public UserMetadata getUser_metadata() {
        return user_metadata;
    }

    public String getEmail() {
        return email;
    }

    public String getConnection() {
        return connection;
    }

    public long getModified_at() {
        return modified_at;
    }

    public class UserMetadata {
        private String photoUrl = "";
        private String skypeName = "";
        private String phone = "";
        private String name = "";
        private String clientId;
        private UserRole role = UserRole.EMPLOYEE;

        public String getPhotoUrl() {
            return photoUrl;
        }

        public String getSkypeName() {
            return skypeName;
        }

        public String getPhone() {
            return phone;
        }

        public String getName() {
            return name;
        }

        public UserRole getRole() {
            return role;
        }

        public void setPhotoUrl(String photoUrl) {
            this.photoUrl = photoUrl;
        }

        public void setSkypeName(String skypeName) {
            this.skypeName = skypeName;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setRole(UserRole role) {
            this.role = role;
        }

        public String getClientId() {
            return clientId;
        }

        public void setClientId(String clientId) {
            this.clientId = clientId;
        }
    }
}
