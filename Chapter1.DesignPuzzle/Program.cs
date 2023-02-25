using Chapter1.DesignPuzzle.Behaviours;
using Chapter1.DesignPuzzle.Models;

var king = new King();
king.SetWeapon(new SwordBehaviour());
king.Fight();

var troll = new Troll();
troll.SetWeapon(new KnifeBehaviour());
troll.Fight();

var queen = new Queen();
queen.SetWeapon(new AxeBehaviour());
queen.Fight();

var knight = new Knight();
knight.SetWeapon(new BowAndArrowBehaviour());
knight.Fight();

