.class Lb/q/q$a;
.super Lb/q/n;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/q/q;->T()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb/q/m;

.field final synthetic b:Lb/q/q;


# direct methods
.method constructor <init>(Lb/q/q;Lb/q/m;)V
    .locals 0

    iput-object p1, p0, Lb/q/q$a;->b:Lb/q/q;

    iput-object p2, p0, Lb/q/q$a;->a:Lb/q/m;

    invoke-direct {p0}, Lb/q/n;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Lb/q/m;)V
    .locals 1

    iget-object v0, p0, Lb/q/q$a;->a:Lb/q/m;

    invoke-virtual {v0}, Lb/q/m;->T()V

    invoke-virtual {p1, p0}, Lb/q/m;->P(Lb/q/m$f;)Lb/q/m;

    return-void
.end method
