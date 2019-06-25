package com.appdynamics.fargate.dto.amazon;

import java.util.ArrayList;

public class FargateMetaDataDto {

        private String Cluster;
        private String TaskARN;
        private String Family;
        private String Revision;
        private String DesiredStatus;
        private String KnownStatus;
        ArrayList< Object > Containers = new ArrayList < Object > ();
        Limits LimitsObject;
        private String PullStartedAt;
        private String PullStoppedAt;


        // Getter Methods

        public String getCluster() {
            return Cluster;
        }

        public String getTaskARN() {
            return TaskARN;
        }

        public String getFamily() {
            return Family;
        }

        public String getRevision() {
            return Revision;
        }

        public String getDesiredStatus() {
            return DesiredStatus;
        }

        public String getKnownStatus() {
            return KnownStatus;
        }

        public Limits getLimits() {
            return LimitsObject;
        }

        public String getPullStartedAt() {
            return PullStartedAt;
        }

        public String getPullStoppedAt() {
            return PullStoppedAt;
        }

        // Setter Methods

        public void setCluster(String Cluster) {
            this.Cluster = Cluster;
        }

        public void setTaskARN(String TaskARN) {
            this.TaskARN = TaskARN;
        }

        public void setFamily(String Family) {
            this.Family = Family;
        }

        public void setRevision(String Revision) {
            this.Revision = Revision;
        }

        public void setDesiredStatus(String DesiredStatus) {
            this.DesiredStatus = DesiredStatus;
        }

        public void setKnownStatus(String KnownStatus) {
            this.KnownStatus = KnownStatus;
        }

        public void setLimits(Limits LimitsObject) {
            this.LimitsObject = LimitsObject;
        }

        public void setPullStartedAt(String PullStartedAt) {
            this.PullStartedAt = PullStartedAt;
        }

        public void setPullStoppedAt(String PullStoppedAt) {
            this.PullStoppedAt = PullStoppedAt;
        }
    }


