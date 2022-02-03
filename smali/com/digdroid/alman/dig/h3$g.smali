.class Lcom/digdroid/alman/dig/h3$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/h3$n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/h3;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/h3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/h3;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/h3$g;->a:Lcom/digdroid/alman/dig/h3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/h3$g;->a:Lcom/digdroid/alman/dig/h3;

    iget-object v0, v0, Lcom/digdroid/alman/dig/h3;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/digdroid/alman/dig/h3$l;

    iput-object p2, p1, Lcom/digdroid/alman/dig/h3$l;->k:Ljava/lang/String;

    return-void
.end method
