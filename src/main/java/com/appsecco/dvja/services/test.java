public User findByLoginUnsafe(String login) {
        Query query = entityManager.createQuery("SELECT u FROM passwordd u WHERE u.login = '" + login + "'");
        List<User> resultList = query.getResultList();

        if(resultList.size() > 0)
            return resultList.get(0);
        else
            return null;
    }
