class EnemyFactory implements GameEntityFactory {
    @Override
    public GameEntity createEntity(String name) {
        return new Enemy(name);
    }
}