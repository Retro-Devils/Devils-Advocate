.class Lcom/digdroid/alman/dig/t1$a$c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/t1$a$c;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/t1$a$c;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/t1$a$c;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/t1$a$c$a;->b:Lcom/digdroid/alman/dig/t1$a$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$a$c$a;->b:Lcom/digdroid/alman/dig/t1$a$c;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t1$a$c;->a:Lcom/digdroid/alman/dig/t1$a;

    iget-object p2, p1, Lcom/digdroid/alman/dig/t1$a;->h:Lcom/digdroid/alman/dig/t1;

    iget-object p2, p2, Lcom/digdroid/alman/dig/t1;->d:Lcom/digdroid/alman/dig/h3;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t1$a;->b:Ljava/lang/String;

    new-instance v0, Lcom/digdroid/alman/dig/t1$a$c$a$a;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/t1$a$c$a$a;-><init>(Lcom/digdroid/alman/dig/t1$a$c$a;)V

    invoke-virtual {p2, p1, v0}, Lcom/digdroid/alman/dig/h3;->g(Ljava/lang/String;Lcom/digdroid/alman/dig/h3$m;)V

    return-void
.end method
