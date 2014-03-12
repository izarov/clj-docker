(defproject docker "0.1.0-SNAPSHOT"
  :description "A work in progress docket API client"
  :url "https://github.com/pauldub/clj-docker"
  :license {:name "MIT License"
            :url "http://choosealicense.com/licenses/mit"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.apache.commons/commons-compress "1.4.1"]
                 [http-kit "2.1.17"]
                 [com.taoensso/timbre "3.1.2"]
                 [slingshot "0.10.3"]
                 [cheshire "5.2.0"]
                 [me.raynes/fs "1.4.4"]]
  :profiles {:dev {:dependencies [[midje "1.6.3"]]}})
