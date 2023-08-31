class Carta {
    constructor(valor, palo) {
        this.valor = valor;
        this.palo = palo;
    }

    getValor() {
        if (isNaN(this.valor)) {
            return this.valor === 'A' ? 11 : 10;
        } else {
            return parseInt(this.valor);
        }
    }
}

class Baraja {
    constructor() {
        this.suits = ['C', 'D', 'H', 'S'];
        this.faceCards = ['J', 'Q', 'K', 'A'];
        this.cartas = [];
        this.crearBaraja();
        this.barajar();
    }

    crearBaraja() {
        for (let i = 2; i <= 10; i++) {
            for (let suit of this.suits) {
                this.cartas.push(new Carta(i.toString(), suit));
            }
        }
        for (let faceCard of this.faceCards) {
            for (let suit of this.suits) {
                this.cartas.push(new Carta(faceCard, suit));
            }
        }
    }

    barajar() {
        for (let i = this.cartas.length - 1; i > 0; i--) {
            const j = Math.floor(Math.random() * (i + 1));
            [this.cartas[i], this.cartas[j]] = [this.cartas[j], this.cartas[i]];
        }
    }

    repartirCarta() {
        if (this.cartas.length === 0) {
            throw 'No hay cartas en la baraja';
        }
        return this.cartas.pop();
    }
}

class BlackjackGame {
    constructor(numJugadores = 2) {
        this.numJugadores = numJugadores;
        this.puntosJugadores = new Array(this.numJugadores).fill(0);
        this.cartasBaraja = new Baraja();

        this.btnNuevo = document.querySelector('#btnNuevo');
        this.btnPedir = document.querySelector('#btnPedir');
        this.btnDetener = document.querySelector('#btnDetener');

        this.divCartasJugadores = document.querySelectorAll('.divCartas');
        this.puntosHTML = document.querySelectorAll('small');

        this.inicializarJuego();
        this.btnPedir.addEventListener('click', () => this.pedirCartaJugador());
        this.btnDetener.addEventListener('click', () => this.detenerJugador());
        this.btnNuevo.addEventListener('click', () => this.inicializarJuego());
    }

    inicializarJuego() {
        this.puntosJugadores = new Array(this.numJugadores).fill(0);
        this.actualizarPuntos();
        
        this.btnPedir.disabled = false;
        this.btnDetener.disabled = false;

        this.divCartasJugadores.forEach(elem => elem.innerText = '');
    }

    pedirCartaJugador() {
        const carta = this.cartasBaraja.repartirCarta();
        const puntos = this.acumularPuntos(carta.getValor(), 0);
        this.crearCarta(carta, 0);

        if (puntos > 21) {
            this.btnPedir.disabled = true;
            this.btnDetener.disabled = true;
            this.turnoComputadora(puntos);
        } else if (puntos === 21) {
            this.btnPedir.disabled = true;
            this.btnDetener.disabled = true;
            this.turnoComputadora(puntos);
        }
    }

    detenerJugador() {
        this.btnPedir.disabled = true;
        this.btnDetener.disabled = true;
        this.turnoComputadora(this.puntosJugadores[0]);
    }

    crearCarta(carta, turno) {
        const imgCarta = document.createElement('img');
        imgCarta.src = `assets/cartas/${carta.valor}${carta.palo}.png`;
        imgCarta.classList.add('carta');
        this.divCartasJugadores[turno].append(imgCarta);
    }

    acumularPuntos(valor, turno) {
        this.puntosJugadores[turno] += valor;
        this.actualizarPuntos();
        return this.puntosJugadores[turno];
    }

    actualizarPuntos() {
        this.puntosHTML.forEach((elem, i) => elem.innerText = this.puntosJugadores[i]);
    }

    turnoComputadora(minimumPoints) {
        let computerPoints = 0;

        do {
            const carta = this.cartasBaraja.repartirCarta();
            computerPoints = this.acumularPuntos(carta.getValor(), this.numJugadores - 1);
            this.crearCarta(carta, this.numJugadores - 1);

        } while ((computerPoints < minimumPoints) && (minimumPoints <= 21));

        this.determinarGanador();
    }

    determinarGanador() {
        setTimeout(() => {
            const [minimumPoints, computerPoints] = this.puntosJugadores;

            if (computerPoints === minimumPoints) {
                alert('Nadie gana.');
            } else if (minimumPoints > 21) {
                alert('La computadora gana.');
            } else if (computerPoints > 21) {
                alert('Jugador gana.');
            } else {
                alert('Computadora gana.');
            }

        }, 100);
    }
}

const juego = new BlackjackGame();
