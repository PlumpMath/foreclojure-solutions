(ns foreclojure-solutions.p126
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Through the Looking Class"
  (let [x __]
    (and (= (class x) x) x)) => true)
