class CharacterFactory implements GameEntityFactory {
    @Override
    public GameEntity createEntity(String name) {
        return new Character(name);
    }
}