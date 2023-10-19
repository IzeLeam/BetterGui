# BetterGui

**BetterGui** est une bibliothèque Java pour Spigot qui simplifie la création d'inventaires interactifs et personnalisés pour les serveurs Minecraft. Cette bibliothèque permet aux développeurs de Spigot de créer des menus et des interfaces utilisateur riches et personnalisées pour améliorer l'expérience de jeu de leurs joueurs.

## Fonctionnalités

- Création d'inventaires personnalisés avec des boutons interactifs.
- Gestion des clics sur les boutons et des événements d'inventaire.
- Personnalisation avancée de l'apparence et du comportement des menus.
- Compatibilité avec les dernières versions de Spigot.

## Installation

Pour utiliser **BetterGui** dans votre projet Spigot :

Avec le .jar :
1. Téléchargez la dernière version de **BetterGui** depuis la section [Releases](https://github.com/IzeLeam/BetterGui/releases).
2. Ajoutez la dépendance dans votre projet

Avec Maven :
```markdown
<depedency>
  <groupId>fr.izeleam.utils</groupId>
  <artifactId>BetterGui</artifactId>
  <version>1.0</version>
</depedency>
```

## Exemple d'Utilisation

```java
// Créer un nouvel inventaire
BetterGuiInventory inventory = BetterGui.createInventory("Mon Menu", 3);

// Ajouter un bouton à l'inventaire
BetterGuiButton button = BetterGui.createButton(Material.DIAMOND_SWORD)
    .setName("§bÉpée en diamant")
    .setLore("§7Une épée puissante.")
    .setAction(new ButtonAction(
        @Override
        public void onClick(final Player player) {
            player.sendMessage("§8Click !");
        }
));

inventory.setButton(13, button);

// Ouvrir l'inventaire pour un joueur
inventory.open(player);
```

## Documentation

Pour plus d'informations sur l'utilisation de **BetterGui**, consultez la [documentation](URL_DE_LA_DOCUMENTATION) complète du projet.

## Contact

- Auteur : Luca
- Discord : izeleam
- Projet : (https://github.com/IzeLeam/BetterGui)
