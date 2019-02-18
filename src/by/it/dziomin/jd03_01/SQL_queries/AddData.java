package by.it.dziomin.jd03_01.SQL_queries;

public interface AddData {
    String ADD_ROLES[] = {"INSERT INTO `dziomin`.`roles` (`id`, `role`) VALUES (1, 'admin');\n",
            "INSERT INTO `dziomin`.`roles` (`id`, `role`) VALUES (2, 'user');"};
    String ADD_USERS[] = {"INSERT INTO `dziomin`.`users` (`id`, `name`, `passport`, `phone`, `roles_id`) VALUES (1, 'PetrAdmin', 'mp12345', '37533134649899', 1);\n",
            "INSERT INTO `dziomin`.`users` (`id`, `name`, `passport`, `phone`, `roles_id`) VALUES (2, 'Vasya', 'mo11111', '37533132131123', 2);\n",
            "INSERT INTO `dziomin`.`users` (`id`, `name`, `passport`, `phone`, `roles_id`) VALUES (3, 'Катя', 'MO23123', '37533135643248', 2);"};
    String ADD_CARS[] ={"INSERT INTO `dziomin`.`cars` (`id`, `name`, `number`, `engine`, `transmission`) VALUES (1, 'Mersedes', '12345', '2.0', 'avto');\n",
            "INSERT INTO `dziomin`.`cars` (`id`, `name`, `number`, `engine`, `transmission`) VALUES (2, 'Lada', '32156', '1.6', 'manual');"};
    String ADD_RENTS[]={"INSERT INTO `dziomin`.`rents` (`id`, `date`, `price`, `isopen`, `users_id`, `cars_id`) VALUES (1, 128999, 100, false, 2, 1);\n",
            "INSERT INTO `dziomin`.`rents` (`id`, `date`, `price`, `isopen`, `users_id`, `cars_id`) VALUES (2, 129999, 150, true, 3, 2);"};
}
