.class Lcom/digdroid/alman/dig/r3$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/r3$u;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/r3;->G(Lcom/digdroid/alman/dig/t3;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/digdroid/alman/dig/r3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/r3;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r3$d;->c:Lcom/digdroid/alman/dig/r3;

    iput-object p2, p0, Lcom/digdroid/alman/dig/r3$d;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/digdroid/alman/dig/r3$d;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/r3$d;->c:Lcom/digdroid/alman/dig/r3;

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/digdroid/alman/dig/r3;->J2(Lcom/digdroid/alman/dig/r3;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/digdroid/alman/dig/r3$d;->c:Lcom/digdroid/alman/dig/r3;

    invoke-static {v0, v1}, Lcom/digdroid/alman/dig/r3;->K2(Lcom/digdroid/alman/dig/r3;Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/r3$d;->c:Lcom/digdroid/alman/dig/r3;

    iget-object v1, p0, Lcom/digdroid/alman/dig/r3$d;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/digdroid/alman/dig/r3;->J2(Lcom/digdroid/alman/dig/r3;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/digdroid/alman/dig/r3$d;->c:Lcom/digdroid/alman/dig/r3;

    iget-object v1, p0, Lcom/digdroid/alman/dig/r3$d;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/digdroid/alman/dig/r3;->K2(Lcom/digdroid/alman/dig/r3;Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method
