.class Lcom/digdroid/alman/dig/x1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/x1;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/digdroid/alman/dig/x1$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/util/ArrayList;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lcom/digdroid/alman/dig/x1$c;

.field final synthetic f:Lcom/digdroid/alman/dig/x1;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/x1;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Lcom/digdroid/alman/dig/x1$c;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/x1$a;->f:Lcom/digdroid/alman/dig/x1;

    iput-object p2, p0, Lcom/digdroid/alman/dig/x1$a;->b:Ljava/util/ArrayList;

    iput-object p3, p0, Lcom/digdroid/alman/dig/x1$a;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/digdroid/alman/dig/x1$a;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/digdroid/alman/dig/x1$a;->e:Lcom/digdroid/alman/dig/x1$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    iget-object p1, p0, Lcom/digdroid/alman/dig/x1$a;->f:Lcom/digdroid/alman/dig/x1;

    iget-object v0, p0, Lcom/digdroid/alman/dig/x1$a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    iget-object v0, p0, Lcom/digdroid/alman/dig/x1$a;->c:Ljava/lang/String;

    iget-object v1, p0, Lcom/digdroid/alman/dig/x1$a;->d:Ljava/lang/String;

    iget-object v2, p0, Lcom/digdroid/alman/dig/x1$a;->e:Lcom/digdroid/alman/dig/x1$c;

    invoke-virtual {p1, p2, v0, v1, v2}, Lcom/digdroid/alman/dig/x1;->b([Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/digdroid/alman/dig/x1$c;)V

    return-void
.end method
