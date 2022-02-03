.class public final Lc/b/a/b/z/k$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/b/a/b/z/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Lc/b/a/b/z/d;

.field private b:Lc/b/a/b/z/d;

.field private c:Lc/b/a/b/z/d;

.field private d:Lc/b/a/b/z/d;

.field private e:Lc/b/a/b/z/c;

.field private f:Lc/b/a/b/z/c;

.field private g:Lc/b/a/b/z/c;

.field private h:Lc/b/a/b/z/c;

.field private i:Lc/b/a/b/z/f;

.field private j:Lc/b/a/b/z/f;

.field private k:Lc/b/a/b/z/f;

.field private l:Lc/b/a/b/z/f;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lc/b/a/b/z/h;->b()Lc/b/a/b/z/d;

    move-result-object v0

    iput-object v0, p0, Lc/b/a/b/z/k$b;->a:Lc/b/a/b/z/d;

    invoke-static {}, Lc/b/a/b/z/h;->b()Lc/b/a/b/z/d;

    move-result-object v0

    iput-object v0, p0, Lc/b/a/b/z/k$b;->b:Lc/b/a/b/z/d;

    invoke-static {}, Lc/b/a/b/z/h;->b()Lc/b/a/b/z/d;

    move-result-object v0

    iput-object v0, p0, Lc/b/a/b/z/k$b;->c:Lc/b/a/b/z/d;

    invoke-static {}, Lc/b/a/b/z/h;->b()Lc/b/a/b/z/d;

    move-result-object v0

    iput-object v0, p0, Lc/b/a/b/z/k$b;->d:Lc/b/a/b/z/d;

    new-instance v0, Lc/b/a/b/z/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lc/b/a/b/z/a;-><init>(F)V

    iput-object v0, p0, Lc/b/a/b/z/k$b;->e:Lc/b/a/b/z/c;

    new-instance v0, Lc/b/a/b/z/a;

    invoke-direct {v0, v1}, Lc/b/a/b/z/a;-><init>(F)V

    iput-object v0, p0, Lc/b/a/b/z/k$b;->f:Lc/b/a/b/z/c;

    new-instance v0, Lc/b/a/b/z/a;

    invoke-direct {v0, v1}, Lc/b/a/b/z/a;-><init>(F)V

    iput-object v0, p0, Lc/b/a/b/z/k$b;->g:Lc/b/a/b/z/c;

    new-instance v0, Lc/b/a/b/z/a;

    invoke-direct {v0, v1}, Lc/b/a/b/z/a;-><init>(F)V

    iput-object v0, p0, Lc/b/a/b/z/k$b;->h:Lc/b/a/b/z/c;

    invoke-static {}, Lc/b/a/b/z/h;->c()Lc/b/a/b/z/f;

    move-result-object v0

    iput-object v0, p0, Lc/b/a/b/z/k$b;->i:Lc/b/a/b/z/f;

    invoke-static {}, Lc/b/a/b/z/h;->c()Lc/b/a/b/z/f;

    move-result-object v0

    iput-object v0, p0, Lc/b/a/b/z/k$b;->j:Lc/b/a/b/z/f;

    invoke-static {}, Lc/b/a/b/z/h;->c()Lc/b/a/b/z/f;

    move-result-object v0

    iput-object v0, p0, Lc/b/a/b/z/k$b;->k:Lc/b/a/b/z/f;

    invoke-static {}, Lc/b/a/b/z/h;->c()Lc/b/a/b/z/f;

    move-result-object v0

    iput-object v0, p0, Lc/b/a/b/z/k$b;->l:Lc/b/a/b/z/f;

    return-void
.end method

.method public constructor <init>(Lc/b/a/b/z/k;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lc/b/a/b/z/h;->b()Lc/b/a/b/z/d;

    move-result-object v0

    iput-object v0, p0, Lc/b/a/b/z/k$b;->a:Lc/b/a/b/z/d;

    invoke-static {}, Lc/b/a/b/z/h;->b()Lc/b/a/b/z/d;

    move-result-object v0

    iput-object v0, p0, Lc/b/a/b/z/k$b;->b:Lc/b/a/b/z/d;

    invoke-static {}, Lc/b/a/b/z/h;->b()Lc/b/a/b/z/d;

    move-result-object v0

    iput-object v0, p0, Lc/b/a/b/z/k$b;->c:Lc/b/a/b/z/d;

    invoke-static {}, Lc/b/a/b/z/h;->b()Lc/b/a/b/z/d;

    move-result-object v0

    iput-object v0, p0, Lc/b/a/b/z/k$b;->d:Lc/b/a/b/z/d;

    new-instance v0, Lc/b/a/b/z/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lc/b/a/b/z/a;-><init>(F)V

    iput-object v0, p0, Lc/b/a/b/z/k$b;->e:Lc/b/a/b/z/c;

    new-instance v0, Lc/b/a/b/z/a;

    invoke-direct {v0, v1}, Lc/b/a/b/z/a;-><init>(F)V

    iput-object v0, p0, Lc/b/a/b/z/k$b;->f:Lc/b/a/b/z/c;

    new-instance v0, Lc/b/a/b/z/a;

    invoke-direct {v0, v1}, Lc/b/a/b/z/a;-><init>(F)V

    iput-object v0, p0, Lc/b/a/b/z/k$b;->g:Lc/b/a/b/z/c;

    new-instance v0, Lc/b/a/b/z/a;

    invoke-direct {v0, v1}, Lc/b/a/b/z/a;-><init>(F)V

    iput-object v0, p0, Lc/b/a/b/z/k$b;->h:Lc/b/a/b/z/c;

    invoke-static {}, Lc/b/a/b/z/h;->c()Lc/b/a/b/z/f;

    move-result-object v0

    iput-object v0, p0, Lc/b/a/b/z/k$b;->i:Lc/b/a/b/z/f;

    invoke-static {}, Lc/b/a/b/z/h;->c()Lc/b/a/b/z/f;

    move-result-object v0

    iput-object v0, p0, Lc/b/a/b/z/k$b;->j:Lc/b/a/b/z/f;

    invoke-static {}, Lc/b/a/b/z/h;->c()Lc/b/a/b/z/f;

    move-result-object v0

    iput-object v0, p0, Lc/b/a/b/z/k$b;->k:Lc/b/a/b/z/f;

    invoke-static {}, Lc/b/a/b/z/h;->c()Lc/b/a/b/z/f;

    move-result-object v0

    iput-object v0, p0, Lc/b/a/b/z/k$b;->l:Lc/b/a/b/z/f;

    iget-object v0, p1, Lc/b/a/b/z/k;->b:Lc/b/a/b/z/d;

    iput-object v0, p0, Lc/b/a/b/z/k$b;->a:Lc/b/a/b/z/d;

    iget-object v0, p1, Lc/b/a/b/z/k;->c:Lc/b/a/b/z/d;

    iput-object v0, p0, Lc/b/a/b/z/k$b;->b:Lc/b/a/b/z/d;

    iget-object v0, p1, Lc/b/a/b/z/k;->d:Lc/b/a/b/z/d;

    iput-object v0, p0, Lc/b/a/b/z/k$b;->c:Lc/b/a/b/z/d;

    iget-object v0, p1, Lc/b/a/b/z/k;->e:Lc/b/a/b/z/d;

    iput-object v0, p0, Lc/b/a/b/z/k$b;->d:Lc/b/a/b/z/d;

    iget-object v0, p1, Lc/b/a/b/z/k;->f:Lc/b/a/b/z/c;

    iput-object v0, p0, Lc/b/a/b/z/k$b;->e:Lc/b/a/b/z/c;

    iget-object v0, p1, Lc/b/a/b/z/k;->g:Lc/b/a/b/z/c;

    iput-object v0, p0, Lc/b/a/b/z/k$b;->f:Lc/b/a/b/z/c;

    iget-object v0, p1, Lc/b/a/b/z/k;->h:Lc/b/a/b/z/c;

    iput-object v0, p0, Lc/b/a/b/z/k$b;->g:Lc/b/a/b/z/c;

    iget-object v0, p1, Lc/b/a/b/z/k;->i:Lc/b/a/b/z/c;

    iput-object v0, p0, Lc/b/a/b/z/k$b;->h:Lc/b/a/b/z/c;

    iget-object v0, p1, Lc/b/a/b/z/k;->j:Lc/b/a/b/z/f;

    iput-object v0, p0, Lc/b/a/b/z/k$b;->i:Lc/b/a/b/z/f;

    iget-object v0, p1, Lc/b/a/b/z/k;->k:Lc/b/a/b/z/f;

    iput-object v0, p0, Lc/b/a/b/z/k$b;->j:Lc/b/a/b/z/f;

    iget-object v0, p1, Lc/b/a/b/z/k;->l:Lc/b/a/b/z/f;

    iput-object v0, p0, Lc/b/a/b/z/k$b;->k:Lc/b/a/b/z/f;

    iget-object p1, p1, Lc/b/a/b/z/k;->m:Lc/b/a/b/z/f;

    iput-object p1, p0, Lc/b/a/b/z/k$b;->l:Lc/b/a/b/z/f;

    return-void
.end method

.method static synthetic a(Lc/b/a/b/z/k$b;)Lc/b/a/b/z/d;
    .locals 0

    iget-object p0, p0, Lc/b/a/b/z/k$b;->a:Lc/b/a/b/z/d;

    return-object p0
.end method

.method static synthetic b(Lc/b/a/b/z/k$b;)Lc/b/a/b/z/f;
    .locals 0

    iget-object p0, p0, Lc/b/a/b/z/k$b;->j:Lc/b/a/b/z/f;

    return-object p0
.end method

.method static synthetic c(Lc/b/a/b/z/k$b;)Lc/b/a/b/z/f;
    .locals 0

    iget-object p0, p0, Lc/b/a/b/z/k$b;->k:Lc/b/a/b/z/f;

    return-object p0
.end method

.method static synthetic d(Lc/b/a/b/z/k$b;)Lc/b/a/b/z/f;
    .locals 0

    iget-object p0, p0, Lc/b/a/b/z/k$b;->l:Lc/b/a/b/z/f;

    return-object p0
.end method

.method static synthetic e(Lc/b/a/b/z/k$b;)Lc/b/a/b/z/d;
    .locals 0

    iget-object p0, p0, Lc/b/a/b/z/k$b;->b:Lc/b/a/b/z/d;

    return-object p0
.end method

.method static synthetic f(Lc/b/a/b/z/k$b;)Lc/b/a/b/z/d;
    .locals 0

    iget-object p0, p0, Lc/b/a/b/z/k$b;->c:Lc/b/a/b/z/d;

    return-object p0
.end method

.method static synthetic g(Lc/b/a/b/z/k$b;)Lc/b/a/b/z/d;
    .locals 0

    iget-object p0, p0, Lc/b/a/b/z/k$b;->d:Lc/b/a/b/z/d;

    return-object p0
.end method

.method static synthetic h(Lc/b/a/b/z/k$b;)Lc/b/a/b/z/c;
    .locals 0

    iget-object p0, p0, Lc/b/a/b/z/k$b;->e:Lc/b/a/b/z/c;

    return-object p0
.end method

.method static synthetic i(Lc/b/a/b/z/k$b;)Lc/b/a/b/z/c;
    .locals 0

    iget-object p0, p0, Lc/b/a/b/z/k$b;->f:Lc/b/a/b/z/c;

    return-object p0
.end method

.method static synthetic j(Lc/b/a/b/z/k$b;)Lc/b/a/b/z/c;
    .locals 0

    iget-object p0, p0, Lc/b/a/b/z/k$b;->g:Lc/b/a/b/z/c;

    return-object p0
.end method

.method static synthetic k(Lc/b/a/b/z/k$b;)Lc/b/a/b/z/c;
    .locals 0

    iget-object p0, p0, Lc/b/a/b/z/k$b;->h:Lc/b/a/b/z/c;

    return-object p0
.end method

.method static synthetic l(Lc/b/a/b/z/k$b;)Lc/b/a/b/z/f;
    .locals 0

    iget-object p0, p0, Lc/b/a/b/z/k$b;->i:Lc/b/a/b/z/f;

    return-object p0
.end method

.method private static n(Lc/b/a/b/z/d;)F
    .locals 1

    instance-of v0, p0, Lc/b/a/b/z/j;

    if-eqz v0, :cond_0

    check-cast p0, Lc/b/a/b/z/j;

    iget p0, p0, Lc/b/a/b/z/j;->a:F

    return p0

    :cond_0
    instance-of v0, p0, Lc/b/a/b/z/e;

    if-eqz v0, :cond_1

    check-cast p0, Lc/b/a/b/z/e;

    iget p0, p0, Lc/b/a/b/z/e;->a:F

    return p0

    :cond_1
    const/high16 p0, -0x40800000    # -1.0f

    return p0
.end method


# virtual methods
.method public A(Lc/b/a/b/z/c;)Lc/b/a/b/z/k$b;
    .locals 0

    iput-object p1, p0, Lc/b/a/b/z/k$b;->e:Lc/b/a/b/z/c;

    return-object p0
.end method

.method public B(ILc/b/a/b/z/c;)Lc/b/a/b/z/k$b;
    .locals 0

    invoke-static {p1}, Lc/b/a/b/z/h;->a(I)Lc/b/a/b/z/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lc/b/a/b/z/k$b;->C(Lc/b/a/b/z/d;)Lc/b/a/b/z/k$b;

    move-result-object p1

    invoke-virtual {p1, p2}, Lc/b/a/b/z/k$b;->E(Lc/b/a/b/z/c;)Lc/b/a/b/z/k$b;

    move-result-object p1

    return-object p1
.end method

.method public C(Lc/b/a/b/z/d;)Lc/b/a/b/z/k$b;
    .locals 1

    iput-object p1, p0, Lc/b/a/b/z/k$b;->b:Lc/b/a/b/z/d;

    invoke-static {p1}, Lc/b/a/b/z/k$b;->n(Lc/b/a/b/z/d;)F

    move-result p1

    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lc/b/a/b/z/k$b;->D(F)Lc/b/a/b/z/k$b;

    :cond_0
    return-object p0
.end method

.method public D(F)Lc/b/a/b/z/k$b;
    .locals 1

    new-instance v0, Lc/b/a/b/z/a;

    invoke-direct {v0, p1}, Lc/b/a/b/z/a;-><init>(F)V

    iput-object v0, p0, Lc/b/a/b/z/k$b;->f:Lc/b/a/b/z/c;

    return-object p0
.end method

.method public E(Lc/b/a/b/z/c;)Lc/b/a/b/z/k$b;
    .locals 0

    iput-object p1, p0, Lc/b/a/b/z/k$b;->f:Lc/b/a/b/z/c;

    return-object p0
.end method

.method public m()Lc/b/a/b/z/k;
    .locals 2

    new-instance v0, Lc/b/a/b/z/k;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lc/b/a/b/z/k;-><init>(Lc/b/a/b/z/k$b;Lc/b/a/b/z/k$a;)V

    return-object v0
.end method

.method public o(F)Lc/b/a/b/z/k$b;
    .locals 1

    invoke-virtual {p0, p1}, Lc/b/a/b/z/k$b;->z(F)Lc/b/a/b/z/k$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc/b/a/b/z/k$b;->D(F)Lc/b/a/b/z/k$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc/b/a/b/z/k$b;->v(F)Lc/b/a/b/z/k$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc/b/a/b/z/k$b;->r(F)Lc/b/a/b/z/k$b;

    move-result-object p1

    return-object p1
.end method

.method public p(ILc/b/a/b/z/c;)Lc/b/a/b/z/k$b;
    .locals 0

    invoke-static {p1}, Lc/b/a/b/z/h;->a(I)Lc/b/a/b/z/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lc/b/a/b/z/k$b;->q(Lc/b/a/b/z/d;)Lc/b/a/b/z/k$b;

    move-result-object p1

    invoke-virtual {p1, p2}, Lc/b/a/b/z/k$b;->s(Lc/b/a/b/z/c;)Lc/b/a/b/z/k$b;

    move-result-object p1

    return-object p1
.end method

.method public q(Lc/b/a/b/z/d;)Lc/b/a/b/z/k$b;
    .locals 1

    iput-object p1, p0, Lc/b/a/b/z/k$b;->d:Lc/b/a/b/z/d;

    invoke-static {p1}, Lc/b/a/b/z/k$b;->n(Lc/b/a/b/z/d;)F

    move-result p1

    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lc/b/a/b/z/k$b;->r(F)Lc/b/a/b/z/k$b;

    :cond_0
    return-object p0
.end method

.method public r(F)Lc/b/a/b/z/k$b;
    .locals 1

    new-instance v0, Lc/b/a/b/z/a;

    invoke-direct {v0, p1}, Lc/b/a/b/z/a;-><init>(F)V

    iput-object v0, p0, Lc/b/a/b/z/k$b;->h:Lc/b/a/b/z/c;

    return-object p0
.end method

.method public s(Lc/b/a/b/z/c;)Lc/b/a/b/z/k$b;
    .locals 0

    iput-object p1, p0, Lc/b/a/b/z/k$b;->h:Lc/b/a/b/z/c;

    return-object p0
.end method

.method public t(ILc/b/a/b/z/c;)Lc/b/a/b/z/k$b;
    .locals 0

    invoke-static {p1}, Lc/b/a/b/z/h;->a(I)Lc/b/a/b/z/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lc/b/a/b/z/k$b;->u(Lc/b/a/b/z/d;)Lc/b/a/b/z/k$b;

    move-result-object p1

    invoke-virtual {p1, p2}, Lc/b/a/b/z/k$b;->w(Lc/b/a/b/z/c;)Lc/b/a/b/z/k$b;

    move-result-object p1

    return-object p1
.end method

.method public u(Lc/b/a/b/z/d;)Lc/b/a/b/z/k$b;
    .locals 1

    iput-object p1, p0, Lc/b/a/b/z/k$b;->c:Lc/b/a/b/z/d;

    invoke-static {p1}, Lc/b/a/b/z/k$b;->n(Lc/b/a/b/z/d;)F

    move-result p1

    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lc/b/a/b/z/k$b;->v(F)Lc/b/a/b/z/k$b;

    :cond_0
    return-object p0
.end method

.method public v(F)Lc/b/a/b/z/k$b;
    .locals 1

    new-instance v0, Lc/b/a/b/z/a;

    invoke-direct {v0, p1}, Lc/b/a/b/z/a;-><init>(F)V

    iput-object v0, p0, Lc/b/a/b/z/k$b;->g:Lc/b/a/b/z/c;

    return-object p0
.end method

.method public w(Lc/b/a/b/z/c;)Lc/b/a/b/z/k$b;
    .locals 0

    iput-object p1, p0, Lc/b/a/b/z/k$b;->g:Lc/b/a/b/z/c;

    return-object p0
.end method

.method public x(ILc/b/a/b/z/c;)Lc/b/a/b/z/k$b;
    .locals 0

    invoke-static {p1}, Lc/b/a/b/z/h;->a(I)Lc/b/a/b/z/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lc/b/a/b/z/k$b;->y(Lc/b/a/b/z/d;)Lc/b/a/b/z/k$b;

    move-result-object p1

    invoke-virtual {p1, p2}, Lc/b/a/b/z/k$b;->A(Lc/b/a/b/z/c;)Lc/b/a/b/z/k$b;

    move-result-object p1

    return-object p1
.end method

.method public y(Lc/b/a/b/z/d;)Lc/b/a/b/z/k$b;
    .locals 1

    iput-object p1, p0, Lc/b/a/b/z/k$b;->a:Lc/b/a/b/z/d;

    invoke-static {p1}, Lc/b/a/b/z/k$b;->n(Lc/b/a/b/z/d;)F

    move-result p1

    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lc/b/a/b/z/k$b;->z(F)Lc/b/a/b/z/k$b;

    :cond_0
    return-object p0
.end method

.method public z(F)Lc/b/a/b/z/k$b;
    .locals 1

    new-instance v0, Lc/b/a/b/z/a;

    invoke-direct {v0, p1}, Lc/b/a/b/z/a;-><init>(F)V

    iput-object v0, p0, Lc/b/a/b/z/k$b;->e:Lc/b/a/b/z/c;

    return-object p0
.end method
