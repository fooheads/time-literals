(ns time-literals.data-readers-cljs
  (:refer-clojure :exclude [time])
  (:require
    [java.time :refer [Period
                       LocalDate
                       LocalDateTime
                       ZonedDateTime
                       OffsetTime
                       Instant
                       OffsetDateTime
                       ZoneId
                       DayOfWeek
                       LocalTime
                       Month
                       Duration
                       Year
                       YearMonth
                       MonthDay]]))

(defn date [x]
  (. java.time.LocalDate parse x))


(defn instant [x]
  (. java.time.Instant parse x))


(defn time [x]
  (. java.time.LocalTime parse x))


(defn offset-time [x]
  (. java.time.OffsetTime parse x))


(defn duration [x]
  (. java.time.Duration parse x))


(defn period [x]
  (. java.time.Period parse x))


(defn zoned-date-time [x]
  (. java.time.ZonedDateTime parse x))


(defn offset-date-time [x]
  (. java.time.OffsetDateTime parse x))


(defn date-time [x]
  (. java.time.LocalDateTime parse x))


(defn year [x]
  (. java.time.Year parse x))


(defn year-month [x]
  (. java.time.YearMonth parse x))


(defn zone [x]
  (. java.time.ZoneId of x))


(defn day-of-week [x]
  (. java.time.DayOfWeek valueOf x))

(defn month [x]
  (. java.time.Month valueOf x))

(defn month-day [x]
  (. java.time.MonthDay parse x))










