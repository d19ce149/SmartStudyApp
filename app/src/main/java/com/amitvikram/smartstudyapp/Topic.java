package com.amitvikram.smartstudyapp;

public class Topic {
    String topicName;
    String topicDetails;
    public Topic(String topicName, String topicDetails) {
        this.topicName = topicName;
        this.topicDetails = topicDetails;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicDetails() {
        return topicDetails;
    }

    public void setTopicDetails(String topicDetails) {
        this.topicDetails = topicDetails;
    }
}
