(ns foreclojure-solutions.p141
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Tricky card games"
  (let [notrump (__ nil)]
    (and (= {:suit :club :rank 9}  (notrump [{:suit :club :rank 4}
                                             {:suit :club :rank 9}]))
         (= {:suit :spade :rank 2} (notrump [{:suit :spade :rank 2}
                                             {:suit :club :rank 10}])))) => true
  {:suit :club :rank 10} => ((__ :club) [{:suit :spade :rank 2}
                                         {:suit :club :rank 10}])
  {:suit :heart :rank 8} => ((__ :heart) [{:suit :heart :rank 6} {:suit :heart :rank 8}
                   {:suit :diamond :rank 10} {:suit :heart :rank 4}]))
