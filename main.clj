;; Bin To Dec
(def x "1101")

(defn getKey [el]
  (println (get el (nth (keys el) 0)))
  (Math/pow 2 (nth (keys el) 0))
)

(def binKeyed (map-indexed hash-map  (reverse x)))

(map getKey binKeyed)